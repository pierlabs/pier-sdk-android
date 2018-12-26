package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{push_a_p_n_s_persist_description}}}
 **/
@ApiModel(description = "{{{push_a_p_n_s_persist_description}}}")
public class PushAPNSPersistValue  {
  
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("tokenDispositivo")
  private String tokenDispositivo = null;
  @SerializedName("certificado")
  private String certificado = null;
  @SerializedName("senha")
  private String senha = null;
  @SerializedName("titulo")
  private String titulo = null;
  @SerializedName("conteudo")
  private String conteudo = null;
  public enum TipoEventoEnum {
     RISCO_FRAUDE,  CODIGO_SEGURANCA,  OUTROS,  OTP_3D_SECURE,  PAGAMENTO,  TRANSACAO_COMPRA_AUTORIZADO,  TRANSACAO_COMPRA_NAO_AUTORIZADO,  TRANSACAO_SAQUE_AUTORIZADO,  TRANSACAO_SAQUE_NAO_AUTORIZADO,  TRANSACAO_PAGAMENTO_AUTORIZADO,  TRANSACAO_PAGAMENTO_NAO_AUTORIZADO,  TRANSACAO_ADVICE,  TRANSACAO_ERRO,  TRANSACAO_SIMULACAO,  TRANSACAO_SENHA_CHIP,  TRANSACAO_CONSULTA_SALDO,  TRANSACAO_CONSULTA_STATUS_CONTA,  TRANSACAO_DESFAZIMENTO,  TRANSACAO_CANCELAMENTO,  TRANSACAO_RESPOSTA_SONDA,  TRANSACAO_TOKEN, 
  };
  @SerializedName("tipoEvento")
  private TipoEventoEnum tipoEvento = null;
  @SerializedName("icone")
  private String icone = null;
  @SerializedName("som")
  private String som = null;

  
  /**
   * {{{push_a_p_n_s_persist_id_pessoa_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{push_a_p_n_s_persist_id_pessoa_value}}}")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{push_a_p_n_s_persist_id_conta_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{push_a_p_n_s_persist_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{push_a_p_n_s_persist_token_dispositivo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{push_a_p_n_s_persist_token_dispositivo_value}}}")
  public String getTokenDispositivo() {
    return tokenDispositivo;
  }
  public void setTokenDispositivo(String tokenDispositivo) {
    this.tokenDispositivo = tokenDispositivo;
  }

  
  /**
   * {{{push_a_p_n_s_persist_certificado_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{push_a_p_n_s_persist_certificado_value}}}")
  public String getCertificado() {
    return certificado;
  }
  public void setCertificado(String certificado) {
    this.certificado = certificado;
  }

  
  /**
   * {{{push_a_p_n_s_persist_senha_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{push_a_p_n_s_persist_senha_value}}}")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  
  /**
   * {{{push_a_p_n_s_persist_titulo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{push_a_p_n_s_persist_titulo_value}}}")
  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  
  /**
   * {{{push_a_p_n_s_persist_conteudo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{push_a_p_n_s_persist_conteudo_value}}}")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  
  /**
   * {{{push_f_c_m_g_c_m_persist_tipo_evento_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{push_f_c_m_g_c_m_persist_tipo_evento_value}}}")
  public TipoEventoEnum getTipoEvento() {
    return tipoEvento;
  }
  public void setTipoEvento(TipoEventoEnum tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  
  /**
   * {{{push_f_c_m_g_c_m_persist_icone_value}}}
   **/
  @ApiModelProperty(value = "{{{push_f_c_m_g_c_m_persist_icone_value}}}")
  public String getIcone() {
    return icone;
  }
  public void setIcone(String icone) {
    this.icone = icone;
  }

  
  /**
   * {{{push_f_c_m_g_c_m_persist_som_value}}}
   **/
  @ApiModelProperty(value = "{{{push_f_c_m_g_c_m_persist_som_value}}}")
  public String getSom() {
    return som;
  }
  public void setSom(String som) {
    this.som = som;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushAPNSPersistValue {\n");
    
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  tokenDispositivo: ").append(tokenDispositivo).append("\n");
    sb.append("  certificado: ").append(certificado).append("\n");
    sb.append("  senha: ").append(senha).append("\n");
    sb.append("  titulo: ").append(titulo).append("\n");
    sb.append("  conteudo: ").append(conteudo).append("\n");
    sb.append("  tipoEvento: ").append(tipoEvento).append("\n");
    sb.append("  icone: ").append(icone).append("\n");
    sb.append("  som: ").append(som).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
