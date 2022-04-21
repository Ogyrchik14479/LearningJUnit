package igor.reznikov.resume.constructor.mappers;

import igor.reznikov.resume.constructor.dtos.request.CustomizableSectionPost;
import igor.reznikov.resume.constructor.dtos.response.CustomizableSectionView;
import igor.reznikov.resume.constructor.entities.CustomizableSection;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomizableSectionMapper {


    CustomizableSectionView toCustomizableSectionDto(CustomizableSection customizableSection);

    CustomizableSection toCustomizableSection(CustomizableSectionView customizableSectionView);

    @Mapping(target = "resume.id", source = "resumeId")
    CustomizableSection toCustomizableSection(CustomizableSectionPost customizableSectionPost);
}
