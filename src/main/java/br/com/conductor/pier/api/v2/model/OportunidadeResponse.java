package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.DetalheOportunidadeResponse;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{oportunidade_response_description}}}
 **/
@ApiModel(description = "{{{oportunidade_response_description}}}")
public class OportunidadeResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTipoOportunidade")
  private Long idTipoOportunidade = null;
  @SerializedName("idStatusOportunidade")
  private Long idStatusOportunidade = null;
  @SerializedName("dataCadastro")
  private String dataCadastro = null;
  @SerializedName("dataAtualizacao")
  private String dataAtualizacao = null;
  @SerializedName("numeroReceitaFederal")
  private String numeroReceitaFederal = null;
  @SerializedName("dataInicioVigencia")
  private String dataInicioVigencia = null;
  @SerializedName("dataFimVigencia")
  private String dataFimVigencia = null;
  @SerializedName("flagAtivo")
  private Boolean flagAtivo = null;
  @SerializedName("detalhes")
  private List<DetalheOportunidadeResponse> detalhes = null;

  
  /**
   * {{{oportunidade_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{oportunidade_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{oportunidade_response_id_tipo_oportunidade_value}}}
   **/
  @ApiModelProperty(value = "{{{oportunidade_response_id_tipo_oportunidade_value}}}")
  public Long getIdTipoOportunidade() {
    return idTipoOportunidade;
  }
  public void setIdTipoOportunidade(Long idTipoOportunidade) {
    this.idTipoOportunidade = idTipoOportunidade;
  }

  
  /**
   * {{{oportunidade_response_id_status_oportunidade_value}}}
   **/
  @ApiModelProperty(value = "{{{oportunidade_response_id_status_oportunidade_value}}}")
  public Long getIdStatusOportunidade() {
    return idStatusOportunidade;
  }
  public void setIdStatusOportunidade(Long idStatusOportunidade) {
    this.idStatusOportunidade = idStatusOportunidade;
  }

  
  /**
   * {{{oportunidade_response_data_cadastro_value}}}
   **/
  @ApiModelProperty(value = "{{{oportunidade_response_data_cadastro_value}}}")
  public String getDataCadastro() {
    return dataCadastro;
  }
  public void setDataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  
  /**
   * {{{oportunidade_response_data_atualizacao_value}}}
   **/
  @ApiModelProperty(value = "{{{oportunidade_response_data_atualizacao_value}}}")
  public String getDataAtualizacao() {
    return dataAtualizacao;
  }
  public void setDataAtualizacao(String dataAtualizacao) {
    this.dataAtualizacao = dataAtualizacao;
  }

  
  /**
   * {{{oportunidade_response_numero_receita_federal_value}}}
   **/
  @ApiModelProperty(value = "{{{oportunidade_response_numero_receita_federal_value}}}")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * {{{oportunidade_response_data_inicio_vigencia_value}}}
   **/
  @ApiModelProperty(value = "{{{oportunidade_response_data_inicio_vigencia_value}}}")
  public String getDataInicioVigencia() {
    return dataInicioVigencia;
  }
  public void setDataInicioVigencia(String dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
  }

  
  /**
   * {{{oportunidade_response_data_fim_vigencia_value}}}
   **/
  @ApiModelProperty(value = "{{{oportunidade_response_data_fim_vigencia_value}}}")
  public String getDataFimVigencia() {
    return dataFimVigencia;
  }
  public void setDataFimVigencia(String dataFimVigencia) {
    this.dataFimVigencia = dataFimVigencia;
  }

  
  /**
   * {{{oportunidade_response_flag_ativo_value}}}
   **/
  @ApiModelProperty(value = "{{{oportunidade_response_flag_ativo_value}}}")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * {{{oportunidade_response_detalhes_value}}}
   **/
  @ApiModelProperty(value = "{{{oportunidade_response_detalhes_value}}}")
  public List<DetalheOportunidadeResponse> getDetalhes() {
    return detalhes;
  }
  public void setDetalhes(List<DetalheOportunidadeResponse> detalhes) {
    this.detalhes = detalhes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OportunidadeResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idTipoOportunidade: ").append(idTipoOportunidade).append("\n");
    sb.append("  idStatusOportunidade: ").append(idStatusOportunidade).append("\n");
    sb.append("  dataCadastro: ").append(dataCadastro).append("\n");
    sb.append("  dataAtualizacao: ").append(dataAtualizacao).append("\n");
    sb.append("  numeroReceitaFederal: ").append(numeroReceitaFederal).append("\n");
    sb.append("  dataInicioVigencia: ").append(dataInicioVigencia).append("\n");
    sb.append("  dataFimVigencia: ").append(dataFimVigencia).append("\n");
    sb.append("  flagAtivo: ").append(flagAtivo).append("\n");
    sb.append("  detalhes: ").append(detalhes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


