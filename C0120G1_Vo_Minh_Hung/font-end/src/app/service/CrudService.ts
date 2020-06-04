import {CrudOperations} from './CrudOperations';
import {Observable} from 'rxjs';
import {HttpClient} from '@angular/common/http';

export abstract class CrudService<T, ID> implements CrudOperations<T, ID> {


  protected constructor(
    protected http: HttpClient,
    protected base: string
  ) {
  }

  save(t: T): Observable<T> {
    return this.http.post<T>(this.base, t);
  }
  update( t: T, id: ID): Observable<T> {
    return this.http.put<T>(`${this.base}/${id}`, t);
  }
  findOne(id: ID): Observable<T> {
    return this.http.get<T>(`${this.base}/${id}`);
  }

  findAll(): Observable<T[]> {
    return this.http.get<T[]>(this.base);
  }

  delete(id: ID): Observable<any> {
    return this.http.delete<T>(`${this.base}/${id}`);
  }

}
