package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{aviso_viagem_response_description}}}
 **/
@ApiModel(description = "{{{aviso_viagem_response_description}}}")
public class AvisoViagemResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("codigoPais")
  private String codigoPais = null;
  @SerializedName("dataInicio")
  private String dataInicio = null;
  @SerializedName("dataFim")
  private String dataFim = null;
  @SerializedName("flagAtivo")
  private Integer flagAtivo = null;

  
  /**
   * {{{aviso_viagem_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{aviso_viagem_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{aviso_viagem_response_id_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{aviso_viagem_response_id_cartao_value}}}")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{aviso_viagem_response_codigo_pais_value}}}
   **/
  @ApiModelProperty(value = "{{{aviso_viagem_response_codigo_pais_value}}}")
  public String getCodigoPais() {
    return codigoPais;
  }
  public void setCodigoPais(String codigoPais) {
    this.codigoPais = codigoPais;
  }

  
  /**
   * {{{aviso_viagem_response_data_inicio_value}}}
   **/
  @ApiModelProperty(value = "{{{aviso_viagem_response_data_inicio_value}}}")
  public String getDataInicio() {
    return dataInicio;
  }
  public void setDataInicio(String dataInicio) {
    this.dataInicio = dataInicio;
  }

  
  /**
   * {{{aviso_viagem_response_data_fim_value}}}
   **/
  @ApiModelProperty(value = "{{{aviso_viagem_response_data_fim_value}}}")
  public String getDataFim() {
    return dataFim;
  }
  public void setDataFim(String dataFim) {
    this.dataFim = dataFim;
  }

  
  /**
   * {{{aviso_viagem_response_flag_ativo_value}}}
   **/
  @ApiModelProperty(value = "{{{aviso_viagem_response_flag_ativo_value}}}")
  public Integer getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvisoViagemResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  codigoPais: ").append(codigoPais).append("\n");
    sb.append("  dataInicio: ").append(dataInicio).append("\n");
    sb.append("  dataFim: ").append(dataFim).append("\n");
    sb.append("  flagAtivo: ").append(flagAtivo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
