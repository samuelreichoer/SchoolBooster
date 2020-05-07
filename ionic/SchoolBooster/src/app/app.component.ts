import { Component, ViewChild } from '@angular/core';
import { Platform, IonTabs } from '@ionic/angular';
import { SplashScreen } from '@ionic-native/splash-screen/ngx';
import { StatusBar } from '@ionic-native/status-bar/ngx';

@Component({
  selector: 'app-root',
  templateUrl: /*'app.component.html'*/'../index.html',
  styleUrls: ['app.component.scss']
})

export class AppComponent {
    isChecklist: boolean;
    isTimetable: boolean;
    isTutors: boolean;
    isChat: boolean;
    isHelp: boolean;
    isSettings: boolean;

    @ViewChild('tabs', {static: false}) nav: IonTabs;

    constructor(
        private platform: Platform,
        private splashScreen: SplashScreen,
        private statusBar: StatusBar
    ){
        this.initializeApp();
    }

  initializeApp() {
    this.platform.ready().then(() => {
      this.statusBar.styleDefault();
      this.splashScreen.hide();
    });
  }

  togglePage(whichPage: string): void {
    this.isChecklist = true;
    this.isTimetable = false;
    this.isTutors = false;
    this.isChat = false;
    this.isHelp = false;
    this.isSettings = false;
  
    let newTab: string='';
  
    switch (whichPage) {
        case'checklist':
            this.isChecklist = true;
            newTab='checklist';
            break;
        case'timetable':
            this.isTimetable = true;
            newTab='timetable';
            break;
        case'tutors':
            this.isTutors = true;
            newTab='tutuors';
            break;
        case'chat':
            this.isChat = true;
            newTab='chat';
            break;
        case'help':
            this.isHelp=true;
            newTab='help';
            break;
        case'settings':
            this.isSettings=true;
            newTab='settings';
            break;
     }
  
     this.nav.select(newTab);
  }
}