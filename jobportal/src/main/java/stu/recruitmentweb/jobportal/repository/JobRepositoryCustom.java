package stu.recruitmentweb.jobportal.repository;

import org.springframework.data.domain.Page;
import stu.recruitmentweb.jobportal.domain.models.Job;


import java.math.BigDecimal;

public interface JobRepositoryCustom {
    Page<Job> searchJob(Integer pageNo,
                        Integer pageSize,
                        BigDecimal minSalary,
                        BigDecimal maxSalary,
                        String companyName,
                        String jobName,
                        String level);
}
