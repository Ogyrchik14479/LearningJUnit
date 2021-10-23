package igor.reznikov.ResumeConstructor.mappers;

import igor.reznikov.ResumeConstructor.dtos.request.PublicationPost;
import igor.reznikov.ResumeConstructor.dtos.response.PublicationView;
import igor.reznikov.ResumeConstructor.entities.Publication;
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
