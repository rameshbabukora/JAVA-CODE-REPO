package in.nareshit.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.raghu.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer>
{

}
