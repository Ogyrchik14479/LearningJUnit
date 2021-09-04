package igor.reznikov.ResumeConstructor.mappers;

import igor.reznikov.ResumeConstructor.dtos.AchievementDto;
import igor.reznikov.ResumeConstructor.entities.Achievement;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AchievementMapper {

    AchievementMapper INSTANCE = Mappers.getMapper(AchievementMapper.class);

    AchievementDto toAchievementDto(Achievement achievement);

    Achievement toAchievement(AchievementDto achievementDto);
}
