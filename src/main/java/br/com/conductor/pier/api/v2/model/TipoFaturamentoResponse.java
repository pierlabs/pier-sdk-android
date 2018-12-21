package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object Billing
 **/
@ApiModel(description = "Object Billing")
public class TipoFaturamentoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("flagApenasDemonstrativo")
  private Boolean flagApenasDemonstrativo = null;
  @SerializedName("idConvenio")
  private Long idConvenio = null;

  
  /**
   * Identification Code of the billing type (id)
   **/
  @ApiModelProperty(value = "Identification Code of the billing type (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Description of theh billing type
   **/
  @ApiModelProperty(value = "Description of theh billing type")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Flag that represents that the billing will be only demonstrative
   **/
  @ApiModelProperty(value = "Flag that represents that the billing will be only demonstrative")
  public Boolean getFlagApenasDemonstrativo() {
    return flagApenasDemonstrativo;
  }
  public void setFlagApenasDemonstrativo(Boolean flagApenasDemonstrativo) {
    this.flagApenasDemonstrativo = flagApenasDemonstrativo;
  }

  
  /**
   * Identification Code of the related covenant to the billing type
   **/
  @ApiModelProperty(value = "Identification Code of the related covenant to the billing type")
  public Long getIdConvenio() {
    return idConvenio;
  }
  public void setIdConvenio(Long idConvenio) {
    this.idConvenio = idConvenio;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoFaturamentoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  flagApenasDemonstrativo: ").append(flagApenasDemonstrativo).append("\n");
    sb.append("  idConvenio: ").append(idConvenio).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
