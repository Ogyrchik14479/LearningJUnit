package igor.reznikov.resume.constructor.mappers;

import igor.reznikov.resume.constructor.dtos.request.LanguagePost;
import igor.reznikov.resume.constructor.dtos.response.LanguageView;
import igor.reznikov.resume.constructor.entities.Language;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface LanguageMapper {


    @Mapping(source = "languageLevelEnum", target = "languageLevel")
    LanguageView toLanguageDto(Language language);

    @InheritInverseConfiguration
    Language toLanguage(LanguageView languageView);

    @InheritInverseConfiguration
    @Mapping(target = "resume.id", source = "resumeId")
    Language toLanguage(LanguagePost languagePost);
}
