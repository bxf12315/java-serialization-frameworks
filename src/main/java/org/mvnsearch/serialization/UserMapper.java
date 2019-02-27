package org.mvnsearch.serialization;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.mvnsearch.serialization.proto.UserPB;

/**
 * User Mapper
 *
 * @author linux_china
 */
@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "bornAt", expression = "java(new java.util.Date(s.getBornAt()))")
    User convert(UserPB s);

    @Mapping(target = "bornAt", expression = "java(s.getBornAt().getTime())")
    UserPB convert(User s);
}