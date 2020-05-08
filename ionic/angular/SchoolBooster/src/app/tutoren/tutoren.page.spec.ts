import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { TutorenPage } from './tutoren.page';

describe('TutorenPage', () => {
  let component: TutorenPage;
  let fixture: ComponentFixture<TutorenPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TutorenPage ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(TutorenPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
