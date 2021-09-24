package igor.reznikov.ResumeConstructor.mappers;

import igor.reznikov.ResumeConstructor.dtos.response.AchievementView;
import igor.reznikov.ResumeConstructor.entities.Achievement;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AchievementMapper {

    AchievementMapper INSTANCE = Mappers.getMapper(AchievementMapper.class);

    AchievementView toAchievementDto(Achievement achievement);

    Achievement toAchievement(AchievementView achievementView);
}
