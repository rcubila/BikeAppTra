import { TestBed } from '@angular/core/testing';

import { BikedefaultsService } from './bikedefaults.service';

describe('BikedefaultsService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: BikedefaultsService = TestBed.get(BikedefaultsService);
    expect(service).toBeTruthy();
  });
});
