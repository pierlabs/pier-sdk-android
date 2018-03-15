package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Response da auditoria dos par\u00E2metros do arquivo.
 **/
@ApiModel(description = "Objeto Response da auditoria dos par\u00E2metros do arquivo.")
public class ArquivoParametroAUDResponse  {
  
  @SerializedName("rev")
  private Long rev = null;
  @SerializedName("revType")
  private Integer revType = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("parametro")
  private String parametro = null;
  @SerializedName("conteudo")
  private String conteudo = null;
  @SerializedName("dataHoraInclusao")
  private String dataHoraInclusao = null;
  @SerializedName("dataHoraAlteracao")
  private String dataHoraAlteracao = null;

  
  /**
   * Identificador da auditoria arquivo
   **/
  @ApiModelProperty(value = "Identificador da auditoria arquivo")
  public Long getRev() {
    return rev;
  }
  public void setRev(Long rev) {
    this.rev = rev;
  }

  
  /**
   * Identificador do tipo de auditoria (0 - Criado, 1 - Alterado, 2 - Exclu\u00EDdo)
   **/
  @ApiModelProperty(value = "Identificador do tipo de auditoria (0 - Criado, 1 - Alterado, 2 - Exclu\u00EDdo)")
  public Integer getRevType() {
    return revType;
  }
  public void setRevType(Integer revType) {
    this.revType = revType;
  }

  
  /**
   * Identificador do par\u00E2metro
   **/
  @ApiModelProperty(value = "Identificador do par\u00E2metro")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Nome do par\u00E2metro
   **/
  @ApiModelProperty(value = "Nome do par\u00E2metro")
  public String getParametro() {
    return parametro;
  }
  public void setParametro(String parametro) {
    this.parametro = parametro;
  }

  
  /**
   * Conte\u00FAdo do par\u00E2metro
   **/
  @ApiModelProperty(value = "Conte\u00FAdo do par\u00E2metro")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  
  /**
   * Data de inclus\u00E3o do par\u00E2metro
   **/
  @ApiModelProperty(value = "Data de inclus\u00E3o do par\u00E2metro")
  public String getDataHoraInclusao() {
    return dataHoraInclusao;
  }
  public void setDataHoraInclusao(String dataHoraInclusao) {
    this.dataHoraInclusao = dataHoraInclusao;
  }

  
  /**
   * Data de altera\u00E7\u00E3o do par\u00E2metro
   **/
  @ApiModelProperty(value = "Data de altera\u00E7\u00E3o do par\u00E2metro")
  public String getDataHoraAlteracao() {
    return dataHoraAlteracao;
  }
  public void setDataHoraAlteracao(String dataHoraAlteracao) {
    this.dataHoraAlteracao = dataHoraAlteracao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArquivoParametroAUDResponse {\n");
    
    sb.append("  rev: ").append(rev).append("\n");
    sb.append("  revType: ").append(revType).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  parametro: ").append(parametro).append("\n");
    sb.append("  conteudo: ").append(conteudo).append("\n");
    sb.append("  dataHoraInclusao: ").append(dataHoraInclusao).append("\n");
    sb.append("  dataHoraAlteracao: ").append(dataHoraAlteracao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
