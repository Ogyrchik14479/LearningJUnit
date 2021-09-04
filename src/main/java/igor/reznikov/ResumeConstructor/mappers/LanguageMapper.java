package igor.reznikov.ResumeConstructor.mappers;

import igor.reznikov.ResumeConstructor.dtos.LanguageDto;
import igor.reznikov.ResumeConstructor.entities.Language;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LanguageMapper {

    LanguageMapper INSTANCE = Mappers.getMapper(LanguageMapper.class);

    @Mapping(source = "languageLevelEnum", target = "languageLevel")
    LanguageDto toLanguageDto(Language language);

    @InheritInverseConfiguration
    Language toLanguage(LanguageDto languageDto);
}
