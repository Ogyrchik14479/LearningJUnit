package igor.reznikov.resume.constructor.mappers;

import igor.reznikov.resume.constructor.dtos.request.RecommendationPost;
import igor.reznikov.resume.constructor.dtos.response.RecommendationView;
import igor.reznikov.resume.constructor.entities.Recommendation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RecommendationMapper {

    RecommendationMapper INSTANCE = Mappers.getMapper(RecommendationMapper.class);

    RecommendationView toRecommendationDto(Recommendation recommendation);

    Recommendation toRecommendation(RecommendationView recommendationView);

    @Mapping(target = "resume.id", source = "resumeId")
    Recommendation toRecommendation(RecommendationPost recommendationPost);
}
