import { NgModule } from '@angular/core';

import { Jhipster2SharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [Jhipster2SharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [Jhipster2SharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class Jhipster2SharedCommonModule {}
