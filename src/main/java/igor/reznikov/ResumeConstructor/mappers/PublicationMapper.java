package igor.reznikov.ResumeConstructor.mappers;

import igor.reznikov.ResumeConstructor.dtos.PublicationDto;
import igor.reznikov.ResumeConstructor.entities.Publication;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PublicationMapper {

    PublicationMapper INSTANCE = Mappers.getMapper(PublicationMapper.class);

    PublicationDto toPublicationDto(Publication publication);

    Publication toPublication(PublicationDto publicationDto);
}
