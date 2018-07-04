package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{tipo_faturamento_persist_description}}}
 **/
@ApiModel(description = "{{{tipo_faturamento_persist_description}}}")
public class TipoFaturamentoPersistValue  {
  
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("flagApenasDemonstrativo")
  private Boolean flagApenasDemonstrativo = null;
  @SerializedName("idConvenio")
  private Long idConvenio = null;

  
  /**
   * {{{tipo_faturamento_persist_descricao_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{tipo_faturamento_persist_descricao_value}}}")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{tipo_faturamento_persist_flag_apenas_demonstrativo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{tipo_faturamento_persist_flag_apenas_demonstrativo_value}}}")
  public Boolean getFlagApenasDemonstrativo() {
    return flagApenasDemonstrativo;
  }
  public void setFlagApenasDemonstrativo(Boolean flagApenasDemonstrativo) {
    this.flagApenasDemonstrativo = flagApenasDemonstrativo;
  }

  
  /**
   * {{{tipo_faturamento_persist_id_convenio_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_faturamento_persist_id_convenio_value}}}")
  public Long getIdConvenio() {
    return idConvenio;
  }
  public void setIdConvenio(Long idConvenio) {
    this.idConvenio = idConvenio;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoFaturamentoPersistValue {\n");
    
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  flagApenasDemonstrativo: ").append(flagApenasDemonstrativo).append("\n");
    sb.append("  idConvenio: ").append(idConvenio).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


