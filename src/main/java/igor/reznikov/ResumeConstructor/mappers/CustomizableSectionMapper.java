package igor.reznikov.ResumeConstructor.mappers;

import igor.reznikov.ResumeConstructor.dtos.CustomizableSectionDto;
import igor.reznikov.ResumeConstructor.entities.CustomizableSection;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomizableSectionMapper {

    CustomizableSectionMapper INSTANCE = Mappers.getMapper(CustomizableSectionMapper.class);

    CustomizableSectionDto toCustomizableSectionDto(CustomizableSection customizableSection);

    CustomizableSection toCustomizableSection(CustomizableSectionDto customizableSectionDto);
}
