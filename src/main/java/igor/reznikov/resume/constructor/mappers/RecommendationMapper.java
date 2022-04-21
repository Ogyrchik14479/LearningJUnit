package igor.reznikov.resume.constructor.mappers;

import igor.reznikov.resume.constructor.dtos.request.RecommendationPost;
import igor.reznikov.resume.constructor.dtos.response.RecommendationView;
import igor.reznikov.resume.constructor.entities.Recommendation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RecommendationMapper {

    RecommendationView toRecommendationDto(Recommendation recommendation);

    Recommendation toRecommendation(RecommendationView recommendationView);

    @Mapping(target = "resume.id", source = "resumeId")
    Recommendation toRecommendation(RecommendationPost recommendationPost);
}
