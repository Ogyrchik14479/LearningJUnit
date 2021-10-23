package igor.reznikov.ResumeConstructor.mappers;

import igor.reznikov.ResumeConstructor.dtos.request.AchievementPost;
import igor.reznikov.ResumeConstructor.dtos.response.AchievementView;
import igor.reznikov.ResumeConstructor.entities.Achievement;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

//TODO отрефакторит ьвсе мапперы эти ужасные
@Mapper
public interface AchievementMapper {

    AchievementMapper INSTANCE = Mappers.getMapper(AchievementMapper.class);

    AchievementView toAchievementDto(Achievement achievement);

    Achievement toAchievement(AchievementView achievementView);

    @Mapping(target = "resume.id", source = "resumeId")
    Achievement toAchievement(AchievementPost achievementPost);
}
