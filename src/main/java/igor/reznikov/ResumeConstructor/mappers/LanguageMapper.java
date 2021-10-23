package igor.reznikov.ResumeConstructor.mappers;

import igor.reznikov.ResumeConstructor.dtos.request.LanguagePost;
import igor.reznikov.ResumeConstructor.dtos.response.LanguageView;
import igor.reznikov.ResumeConstructor.entities.Language;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LanguageMapper {

    LanguageMapper INSTANCE = Mappers.getMapper(LanguageMapper.class);

    @Mapping(source = "languageLevelEnum", target = "languageLevel")
    LanguageView toLanguageDto(Language language);

    @InheritInverseConfiguration
    Language toLanguage(LanguageView languageView);

    @InheritInverseConfiguration
    @Mapping(target = "resume.id", source = "resumeId")
    Language toLanguage(LanguagePost languagePost);
}
