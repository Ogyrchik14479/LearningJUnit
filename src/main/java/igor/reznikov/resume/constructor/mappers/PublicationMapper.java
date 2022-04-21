package igor.reznikov.resume.constructor.mappers;

import igor.reznikov.resume.constructor.dtos.request.PublicationPost;
import igor.reznikov.resume.constructor.dtos.response.PublicationView;
import igor.reznikov.resume.constructor.entities.Publication;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PublicationMapper {

    PublicationMapper INSTANCE = Mappers.getMapper(PublicationMapper.class);

    PublicationView toPublicationDto(Publication publication);

    Publication toPublication(PublicationView publicationView);

    @Mapping(target = "resume.id", source = "resumeId")
    Publication toPublication(PublicationPost publicationPost);
}
