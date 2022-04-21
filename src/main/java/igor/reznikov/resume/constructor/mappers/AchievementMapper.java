package igor.reznikov.resume.constructor.mappers;

import igor.reznikov.resume.constructor.dtos.request.AchievementPost;
import igor.reznikov.resume.constructor.dtos.response.AchievementView;
import igor.reznikov.resume.constructor.entities.Achievement;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AchievementMapper {

    AchievementView toAchievementDto(Achievement achievement);

    Achievement toAchievement(AchievementView achievementView);

    @Mapping(target = "resume.id", source = "resumeId")
    Achievement toAchievement(AchievementPost achievementPost);
}
