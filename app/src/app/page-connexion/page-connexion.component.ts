import { User } from './../user';
import { UtilisateurService } from './../utilisateur.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-page-connexion',
  templateUrl: './page-connexion.component.html',
  styleUrls: ['./page-connexion.component.css']
})
export class PageConnexionComponent implements OnInit {
  UtilisateurForm: User = new User();
  isFailed: boolean = false;
  
  constructor(private srvUtiliateur: UtilisateurService) { }

  ngOnInit() {
  }

  public connexion() {
    // this.srvUtiliateur.connexion(
    //   this.UtilisateurForm.username,
    //   this.UtilisateurForm.password);
    
    this.srvUtiliateur.connexion2(this.UtilisateurForm);
    //this.isFailed = !this.srvUtiliateur.connexion2(this.UtilisateurForm);
  }

}
