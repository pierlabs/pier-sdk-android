package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.DetalheOportunidadeUpdateValue;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{oportunidade_update_description}}}
 **/
@ApiModel(description = "{{{oportunidade_update_description}}}")
public class OportunidadeUpdateValue  {
  
  @SerializedName("idTipoOportunidade")
  private Long idTipoOportunidade = null;
  @SerializedName("idStatusOportunidade")
  private Long idStatusOportunidade = null;
  @SerializedName("numeroReceitaFederal")
  private String numeroReceitaFederal = null;
  @SerializedName("dataInicioVigencia")
  private String dataInicioVigencia = null;
  @SerializedName("dataFimVigencia")
  private String dataFimVigencia = null;
  @SerializedName("flagAtivo")
  private Boolean flagAtivo = null;
  @SerializedName("detalhes")
  private List<DetalheOportunidadeUpdateValue> detalhes = null;

  
  /**
   * {{{oportunidade_update_id_tipo_oportunidade_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{oportunidade_update_id_tipo_oportunidade_value}}}")
  public Long getIdTipoOportunidade() {
    return idTipoOportunidade;
  }
  public void setIdTipoOportunidade(Long idTipoOportunidade) {
    this.idTipoOportunidade = idTipoOportunidade;
  }

  
  /**
   * {{{oportunidade_update_id_status_oportunidade_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{oportunidade_update_id_status_oportunidade_value}}}")
  public Long getIdStatusOportunidade() {
    return idStatusOportunidade;
  }
  public void setIdStatusOportunidade(Long idStatusOportunidade) {
    this.idStatusOportunidade = idStatusOportunidade;
  }

  
  /**
   * {{{oportunidade_update_numero_receita_federal_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{oportunidade_update_numero_receita_federal_value}}}")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * {{{oportunidade_update_data_inicio_vigencia_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{oportunidade_update_data_inicio_vigencia_value}}}")
  public String getDataInicioVigencia() {
    return dataInicioVigencia;
  }
  public void setDataInicioVigencia(String dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
  }

  
  /**
   * {{{oportunidade_update_data_fim_vigencia_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{oportunidade_update_data_fim_vigencia_value}}}")
  public String getDataFimVigencia() {
    return dataFimVigencia;
  }
  public void setDataFimVigencia(String dataFimVigencia) {
    this.dataFimVigencia = dataFimVigencia;
  }

  
  /**
   * {{{oportunidade_update_flag_ativo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{oportunidade_update_flag_ativo_value}}}")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * {{{oportunidade_update_detalhes_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{oportunidade_update_detalhes_value}}}")
  public List<DetalheOportunidadeUpdateValue> getDetalhes() {
    return detalhes;
  }
  public void setDetalhes(List<DetalheOportunidadeUpdateValue> detalhes) {
    this.detalhes = detalhes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OportunidadeUpdateValue {\n");
    
    sb.append("  idTipoOportunidade: ").append(idTipoOportunidade).append("\n");
    sb.append("  idStatusOportunidade: ").append(idStatusOportunidade).append("\n");
    sb.append("  numeroReceitaFederal: ").append(numeroReceitaFederal).append("\n");
    sb.append("  dataInicioVigencia: ").append(dataInicioVigencia).append("\n");
    sb.append("  dataFimVigencia: ").append(dataFimVigencia).append("\n");
    sb.append("  flagAtivo: ").append(flagAtivo).append("\n");
    sb.append("  detalhes: ").append(detalhes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


