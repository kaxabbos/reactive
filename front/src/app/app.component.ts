import {Component, OnInit} from '@angular/core';
import {RouterOutlet} from '@angular/router';
import {FooterComponent} from "./footer/footer.component";
import {NavComponent} from "./nav/nav.component";
import {AuthService} from "./auth/auth.service";

@Component({
	selector: 'app-root',
	standalone: true,
	imports: [
		RouterOutlet,
		FooterComponent,
		NavComponent,
	],
	templateUrl: './app.component.html',
})

export class AppComponent implements OnInit{
	constructor(
		private authService: AuthService,
	) {
	}

	ngOnInit(): void {
		this.authService.getUserProfile();
	}

}
