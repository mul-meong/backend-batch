package com.mulmeong.batchserver.comment.infrastructure.repository;

import com.mulmeong.batchserver.comment.domain.document.ShortsComment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShortsCommentReadRepository extends MongoRepository<ShortsComment, String> {

    Optional<ShortsComment> findByCommentUuid(String commentUuid);

}