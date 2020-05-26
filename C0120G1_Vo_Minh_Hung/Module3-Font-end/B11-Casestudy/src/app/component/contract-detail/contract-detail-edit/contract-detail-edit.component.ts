import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {Contract} from '../../../model/contract';
import {ContractDetailService} from '../../../services/contract-detail.service';
import {ContractService} from '../../../services/contract.service';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-contract-detail-edit',
  templateUrl: './contract-detail-edit.component.html',
  styleUrls: ['./contract-detail-edit.component.css']
})
export class ContractDetailEditComponent implements OnInit {
  public formEditContractDetail: FormGroup;
  public contract: Contract[] = [];
  public contractDetailOfId;
  constructor(
    public formBuilder: FormBuilder,
    public contractDetailService: ContractDetailService,
    public activatedRouter: ActivatedRoute,
    public contractService: ContractService,
    public router: Router
  ) { }

  ngOnInit(): void {
    this.contractService.getAllContracts().subscribe(data =>
      this.contract = data);
    this.formEditContractDetail = this.formBuilder.group({
      idContract: ['', [Validators.required]],
      accompany: ['', [Validators.required]],
      quantity: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
    });
    this.activatedRouter.params.subscribe(data => {
      this.contractDetailOfId = data.id;
      this.contractDetailService.getContractDetailById(this.contractDetailOfId).subscribe(data => {
        this.formEditContractDetail.patchValue(data);
      });
    });
  }
  editContractDetail() {
    this.contractDetailService.editContractDetail(this.formEditContractDetail.value, this.contractDetailOfId).subscribe(data => {
      this.router.navigateByUrl('contract-detail-list');
    });
  }

}
