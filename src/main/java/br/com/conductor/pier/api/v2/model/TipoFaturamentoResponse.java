package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Faturamento
 **/
@ApiModel(description = "Objeto Faturamento")
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
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo de faturamento (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo de faturamento (id).")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Desci\u00C3\u00A7\u00C3\u00A3o do tipo de faturamento.
   **/
  @ApiModelProperty(value = "Desci\u00C3\u00A7\u00C3\u00A3o do tipo de faturamento.")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Flag que representa que o faturamento ser\u00C3\u00A1 apenas demonstrativo.
   **/
  @ApiModelProperty(value = "Flag que representa que o faturamento ser\u00C3\u00A1 apenas demonstrativo.")
  public Boolean getFlagApenasDemonstrativo() {
    return flagApenasDemonstrativo;
  }
  public void setFlagApenasDemonstrativo(Boolean flagApenasDemonstrativo) {
    this.flagApenasDemonstrativo = flagApenasDemonstrativo;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do conv\u00C3\u00AAnio relacionado ao tipo de faturamento.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do conv\u00C3\u00AAnio relacionado ao tipo de faturamento.")
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
