package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * TipoFaturamentoPersist
 **/
@ApiModel(description = "TipoFaturamentoPersist")
public class TipoFaturamentoPersist  {
  
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("flagApenasDemonstrativo")
  private Boolean flagApenasDemonstrativo = null;
  @SerializedName("idConvenio")
  private Long idConvenio = null;

  
  /**
   * Desci\u00E7\u00E3o do tipo de faturamento.
   **/
  @ApiModelProperty(required = true, value = "Desci\u00E7\u00E3o do tipo de faturamento.")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Flag que representa que o faturamento ser\u00E1 apenas demonstrativo.
   **/
  @ApiModelProperty(required = true, value = "Flag que representa que o faturamento ser\u00E1 apenas demonstrativo.")
  public Boolean getFlagApenasDemonstrativo() {
    return flagApenasDemonstrativo;
  }
  public void setFlagApenasDemonstrativo(Boolean flagApenasDemonstrativo) {
    this.flagApenasDemonstrativo = flagApenasDemonstrativo;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do convenio relacionado ao tipo de faturamento.
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do convenio relacionado ao tipo de faturamento.")
  public Long getIdConvenio() {
    return idConvenio;
  }
  public void setIdConvenio(Long idConvenio) {
    this.idConvenio = idConvenio;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoFaturamentoPersist {\n");
    
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  flagApenasDemonstrativo: ").append(flagApenasDemonstrativo).append("\n");
    sb.append("  idConvenio: ").append(idConvenio).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
