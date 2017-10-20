import {Injectable} from '@angular/core';
import {CanActivate} from '@angular/router';
import {Observable} from 'rxjs/Observable';
import {AuthService} from '../services/auth.service';

@Injectable()
export class AuthenticatedGuard implements CanActivate {

  constructor(private authService: AuthService) {}

  canActivate(): Observable<boolean> | Promise<boolean> | boolean {
     return this.authService.authenticated;
  }
}
