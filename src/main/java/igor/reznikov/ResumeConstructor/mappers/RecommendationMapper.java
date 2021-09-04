package igor.reznikov.ResumeConstructor.mappers;

import igor.reznikov.ResumeConstructor.dtos.RecommendationDto;
import igor.reznikov.ResumeConstructor.entities.Recommendation;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RecommendationMapper {

    RecommendationMapper INSTANCE = Mappers.getMapper(RecommendationMapper.class);

    RecommendationDto toRecommendationDto(Recommendation recommendation);

    Recommendation toRecommendation(RecommendationDto recommendationDto);
}
