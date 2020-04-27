import { Component } from '@angular/core';

import { Platform } from '@ionic/angular';
import { SplashScreen } from '@ionic-native/splash-screen/ngx';
import { StatusBar } from '@ionic-native/status-bar/ngx';

@Component({
  selector: 'app-root',
  templateUrl: 'app.component.html',
  styleUrls: ['app.component.scss']
})
export class AppComponent {
  isList: boolean;
    isLocation: boolean;
    isSelf: boolean;
    isNotifications: boolean;
    isCamera: boolean;
    isSearch: boolean;
  constructor(
    private platform: Platform,
    private splashScreen: SplashScreen,
    private statusBar: StatusBar
  ) {
    this.initializeApp();
  }

  initializeApp() {
    this.platform.ready().then(() => {
      this.statusBar.styleDefault();
      this.splashScreen.hide();
    });
  }

  togglePage(whichPage: string): void {
    this.isList=false;
    this.isLocation=false;
    this.isSelf=false;
    this.isNotifications=false;
    this.isSearch=false;
    this.isCamera=false;
  
    letnewTab: string='';
  
    switch (whichPage) {
      case'List':
        this.isList=true;
        newTab='PhotosPage';
        break;
      case'Location':
        this.isLocation=true;
        newTab='LocationsPage';
        break;
      case'Self':
        this.isSelf=true;
        newTab='SelfPage';
        break;
      case'Notifications':
        this.isNotifications=true;
        newTab='NotificationsPage';
        break;
      case'Search':
        this.isSearch=true;
        newTab='SearchPage';
        break;
      case'Camera':
        this.isCamera=true;
        newTab='CameraPage';
        break;
     }
  
     this.nav.setRoot(newTab);
  }
}