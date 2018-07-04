package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{s_m_s_persist_description}}}
 **/
@ApiModel(description = "{{{s_m_s_persist_description}}}")
public class SMSPersistValue  {
  
  @SerializedName("nsu")
  private Long nsu = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("celular")
  private String celular = null;
  @SerializedName("conteudo")
  private String conteudo = null;
  @SerializedName("dataAgendamento")
  private String dataAgendamento = null;
  public enum TipoEventoEnum {
     RISCO_FRAUDE,  CODIGO_SEGURANCA,  OUTROS, 
  };
  @SerializedName("tipoEvento")
  private TipoEventoEnum tipoEvento = null;

  
  /**
   * {{{s_m_s_persist_nsu_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{s_m_s_persist_nsu_value}}}")
  public Long getNsu() {
    return nsu;
  }
  public void setNsu(Long nsu) {
    this.nsu = nsu;
  }

  
  /**
   * {{{s_m_s_persist_id_pessoa_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{s_m_s_persist_id_pessoa_value}}}")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{s_m_s_persist_id_conta_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{s_m_s_persist_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{s_m_s_persist_celular_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{s_m_s_persist_celular_value}}}")
  public String getCelular() {
    return celular;
  }
  public void setCelular(String celular) {
    this.celular = celular;
  }

  
  /**
   * {{{s_m_s_persist_conteudo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{s_m_s_persist_conteudo_value}}}")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  
  /**
   * {{{s_m_s_persist_data_agendamento_value}}}
   **/
  @ApiModelProperty(value = "{{{s_m_s_persist_data_agendamento_value}}}")
  public String getDataAgendamento() {
    return dataAgendamento;
  }
  public void setDataAgendamento(String dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
  }

  
  /**
   * {{{s_m_s_persist_tipo_evento_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{s_m_s_persist_tipo_evento_value}}}")
  public TipoEventoEnum getTipoEvento() {
    return tipoEvento;
  }
  public void setTipoEvento(TipoEventoEnum tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SMSPersistValue {\n");
    
    sb.append("  nsu: ").append(nsu).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  celular: ").append(celular).append("\n");
    sb.append("  conteudo: ").append(conteudo).append("\n");
    sb.append("  dataAgendamento: ").append(dataAgendamento).append("\n");
    sb.append("  tipoEvento: ").append(tipoEvento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


