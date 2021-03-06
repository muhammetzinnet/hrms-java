package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilites.result.DataResult;
import kodlamaio.hrms.core.utilites.result.Result;
import kodlamaio.hrms.entities.concretes.JobPosition;

import java.util.List;

public interface JobPositionService {

    DataResult<List <JobPosition>> getAll();
    Result add(JobPosition jobPosition);
}
