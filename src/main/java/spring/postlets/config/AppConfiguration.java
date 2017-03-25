package spring.postlets.config;


import aQute.bnd.annotation.metatype.Meta;


@Meta.OCD(id = "spring.postlets.config.AppConfiguration")
public interface AppConfiguration {

    @Meta.AD()
    public String buttonTitle();


    @Meta.AD()
    public String linkTitle();
}