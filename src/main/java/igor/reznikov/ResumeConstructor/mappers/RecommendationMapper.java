package igor.reznikov.ResumeConstructor.mappers;

import igor.reznikov.ResumeConstructor.dtos.response.RecommendationView;
import igor.reznikov.ResumeConstructor.entities.Recommendation;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RecommendationMapper {

    RecommendationMapper INSTANCE = Mappers.getMapper(RecommendationMapper.class);

    RecommendationView toRecommendationDto(Recommendation recommendation);

    Recommendation toRecommendation(RecommendationView recommendationView);
}
