import { TestBed } from '@angular/core/testing';
import { UtilisateurService } from './utilisateur.service';
import { RouterTestingModule } from '@angular/router/testing';
import { async, ComponentFixture } from '@angular/core/testing';
import { __values } from 'tslib';


describe('UtilisateurService', () => {
  
  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [RouterTestingModule],
      declarations: [
        UtilisateurService
      ],
    }).compileComponents();
  }));
  // beforeEach(async(() => {
  //   TestBed.configureTestingModule({
  //     imports: [RouterTestingModule],
  //   })
  //   .compileComponents();
  // }));

  beforeEach(() => {
    let service: UtilisateurService;
    TestBed.configureTestingModule({});
    service = TestBed.inject(UtilisateurService);
  });

  it('lemail est valide', () => {
    let service: UtilisateurService;
   const email = service.isValidEmail("test@test.com");

   expect(email).toBeTruthy();
  });

  it('age valide', () => {
    let service = new UtilisateurService(null);
    let age = service.validAge("12");

    expect(age).toBe(12);
  })
  
});


