import { Component, OnInit } from '@angular/core';
import {Contract} from '../../../model/contract';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {ContractDetailService} from '../../../services/contract-detail.service';
import {Router} from '@angular/router';
import {ContractService} from '../../../services/contract.service';

@Component({
  selector: 'app-contract-detail-add',
  templateUrl: './contract-detail-add.component.html',
  styleUrls: ['./contract-detail-add.component.css']
})
export class ContractDetailAddComponent implements OnInit {
  public formAddNewContractDetail: FormGroup;
  public contract: Contract[] = [];
  constructor(
    public formBuilder: FormBuilder,
    public contractDetailService: ContractDetailService,
    public contractService: ContractService,
    public router: Router
  ) { }

  ngOnInit(): void {
    this.contractService.getAllContracts().subscribe(data =>
      this.contract = data);
    this.formAddNewContractDetail = this.formBuilder.group({
      idContract: ['', [Validators.required]],
      accompany: ['', [Validators.required]],
      quantity: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
    });
  }

  addNewContractDetail() {
    this.contractDetailService.addNewContractDetail(this.formAddNewContractDetail.value).subscribe(data => {
      this.router.navigateByUrl('contract-detail-list');
    });

  }
}
