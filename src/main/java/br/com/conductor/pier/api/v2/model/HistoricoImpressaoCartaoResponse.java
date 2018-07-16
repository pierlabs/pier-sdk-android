package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{historico_impressao_cartao_response_description}}}
 **/
@ApiModel(description = "{{{historico_impressao_cartao_response_description}}}")
public class HistoricoImpressaoCartaoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("idStatusImpressaoCartao")
  private Long idStatusImpressaoCartao = null;
  @SerializedName("mensagemHistorico")
  private String mensagemHistorico = null;
  @SerializedName("dataHistorico")
  private String dataHistorico = null;

  
  /**
   * {{{historico_impressao_cartao_response_id_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{historico_impressao_cartao_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{historico_impressao_cartao_response_id_cartao_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{historico_impressao_cartao_response_id_cartao_value}}}")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{historico_impressao_cartao_response_id_status_impressao_cartao_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{historico_impressao_cartao_response_id_status_impressao_cartao_value}}}")
  public Long getIdStatusImpressaoCartao() {
    return idStatusImpressaoCartao;
  }
  public void setIdStatusImpressaoCartao(Long idStatusImpressaoCartao) {
    this.idStatusImpressaoCartao = idStatusImpressaoCartao;
  }

  
  /**
   * {{{historico_impressao_cartao_response_mensagem_historico_value}}}
   **/
  @ApiModelProperty(value = "{{{historico_impressao_cartao_response_mensagem_historico_value}}}")
  public String getMensagemHistorico() {
    return mensagemHistorico;
  }
  public void setMensagemHistorico(String mensagemHistorico) {
    this.mensagemHistorico = mensagemHistorico;
  }

  
  /**
   * {{{historico_impressao_cartao_response_data_historico_value}}}
   **/
  @ApiModelProperty(value = "{{{historico_impressao_cartao_response_data_historico_value}}}")
  public String getDataHistorico() {
    return dataHistorico;
  }
  public void setDataHistorico(String dataHistorico) {
    this.dataHistorico = dataHistorico;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricoImpressaoCartaoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  idStatusImpressaoCartao: ").append(idStatusImpressaoCartao).append("\n");
    sb.append("  mensagemHistorico: ").append(mensagemHistorico).append("\n");
    sb.append("  dataHistorico: ").append(dataHistorico).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


