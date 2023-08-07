package stu.recruitmentweb.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stu.recruitmentweb.jobportal.domain.models.Recruitment;

@Repository
public interface RecruitmentRepository extends JpaRepository<Recruitment, Long> {
}
