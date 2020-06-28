/* tslint:disable:no-unused-variable */

import { TestBed, async, inject } from '@angular/core/testing';
import { ItemaddService } from './itemadd.service';

describe('Service: Itemadd', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [ItemaddService]
    });
  });

  it('should ...', inject([ItemaddService], (service: ItemaddService) => {
    expect(service).toBeTruthy();
  }));
});
