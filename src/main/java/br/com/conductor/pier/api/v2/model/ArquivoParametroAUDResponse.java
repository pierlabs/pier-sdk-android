package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{arquivo_parametro_a_u_d_response_description}}}
 **/
@ApiModel(description = "{{{arquivo_parametro_a_u_d_response_description}}}")
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
   * {{{arquivo_parametro_a_u_d_response_rev_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_parametro_a_u_d_response_rev_value}}}")
  public Long getRev() {
    return rev;
  }
  public void setRev(Long rev) {
    this.rev = rev;
  }

  
  /**
   * {{{arquivo_parametro_a_u_d_response_rev_type_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_parametro_a_u_d_response_rev_type_value}}}")
  public Integer getRevType() {
    return revType;
  }
  public void setRevType(Integer revType) {
    this.revType = revType;
  }

  
  /**
   * {{{arquivo_parametro_a_u_d_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_parametro_a_u_d_response_id_value}}}")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * {{{arquivo_parametro_a_u_d_response_parametro_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_parametro_a_u_d_response_parametro_value}}}")
  public String getParametro() {
    return parametro;
  }
  public void setParametro(String parametro) {
    this.parametro = parametro;
  }

  
  /**
   * {{{arquivo_parametro_a_u_d_response_conteudo_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_parametro_a_u_d_response_conteudo_value}}}")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  
  /**
   * {{{arquivo_parametro_a_u_d_response_data_hora_inclusao_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_parametro_a_u_d_response_data_hora_inclusao_value}}}")
  public String getDataHoraInclusao() {
    return dataHoraInclusao;
  }
  public void setDataHoraInclusao(String dataHoraInclusao) {
    this.dataHoraInclusao = dataHoraInclusao;
  }

  
  /**
   * {{{arquivo_parametro_a_u_d_response_data_hora_alteracao_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_parametro_a_u_d_response_data_hora_alteracao_value}}}")
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


