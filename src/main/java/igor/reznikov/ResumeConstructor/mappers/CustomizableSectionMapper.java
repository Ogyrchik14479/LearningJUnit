package igor.reznikov.ResumeConstructor.mappers;

import igor.reznikov.ResumeConstructor.dtos.request.CustomizableSectionPost;
import igor.reznikov.ResumeConstructor.dtos.response.CustomizableSectionView;
import igor.reznikov.ResumeConstructor.entities.CustomizableSection;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomizableSectionMapper {

    CustomizableSectionMapper INSTANCE = Mappers.getMapper(CustomizableSectionMapper.class);

    CustomizableSectionView toCustomizableSectionDto(CustomizableSection customizableSection);

    CustomizableSection toCustomizableSection(CustomizableSectionView customizableSectionView);

    @Mapping(target = "resume.id", source = "resumeId")
    CustomizableSection toCustomizableSection(CustomizableSectionPost customizableSectionPost);
}
