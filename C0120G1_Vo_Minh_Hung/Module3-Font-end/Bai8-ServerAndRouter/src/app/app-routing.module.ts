import { NgModule } from '@angular/core';
import {Routes, RouterModule, PreloadAllModules} from '@angular/router';
import {LoginComponent} from './login/login.component';
import {RegisterComponent} from './register/register.component';
import {TimelinesComponent} from './timelines/timelines.component';
import {YoutubePlayerComponent} from './youtube-player/youtube-player.component';
import {YoutubePlaylistComponent} from './youtube-playlist/youtube-playlist.component';
import {DictionaryPageComponent} from './dictionary-page/dictionary-page.component';
import {DictionaryDetailComponent} from './dictionary-detail/dictionary-detail.component';


const routes: Routes = [
  {path: 'login', component: LoginComponent},
  {path: 'register', component: RegisterComponent},
  {path: 'timelines', component: TimelinesComponent},
  { path: 'dictionary', component: DictionaryPageComponent,
    children: [
      {
        path: ':key',
        component: DictionaryDetailComponent,
        // canActivate: [AuthGuard]
      }
    ]
  },
  {path: 'youtube',    component: YoutubePlaylistComponent,
    children: [{
      path: ':id',
      component: YoutubePlayerComponent
    }]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {
    preloadingStrategy: PreloadAllModules
  })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
