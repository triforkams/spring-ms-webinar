package talk;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TalkRepository extends CrudRepository<Talk, Long>, QueryDslPredicateExecutor<Talk> {
}
