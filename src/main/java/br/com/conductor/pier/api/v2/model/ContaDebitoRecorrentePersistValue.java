package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{conta_debito_recorrente_persist_description}}}
 **/
@ApiModel(description = "{{{conta_debito_recorrente_persist_description}}}")
public class ContaDebitoRecorrentePersistValue  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idTipoDebitoRecorrente")
  private Long idTipoDebitoRecorrente = null;
  @SerializedName("idUsuario")
  private Long idUsuario = null;
  @SerializedName("login")
  private String login = null;
  @SerializedName("numeroParcelas")
  private Integer numeroParcelas = null;

  
  /**
   * {{{conta_debito_recorrente_persist_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_debito_recorrente_persist_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{conta_debito_recorrente_persist_id_tipo_debito_recorrente_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_debito_recorrente_persist_id_tipo_debito_recorrente_value}}}")
  public Long getIdTipoDebitoRecorrente() {
    return idTipoDebitoRecorrente;
  }
  public void setIdTipoDebitoRecorrente(Long idTipoDebitoRecorrente) {
    this.idTipoDebitoRecorrente = idTipoDebitoRecorrente;
  }

  
  /**
   * {{{conta_debito_recorrente_persist_id_usuario_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_debito_recorrente_persist_id_usuario_value}}}")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  
  /**
   * {{{conta_debito_recorrente_persist_login_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_debito_recorrente_persist_login_value}}}")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * {{{conta_debito_recorrente_persist_num_parcelas_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_debito_recorrente_persist_num_parcelas_value}}}")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaDebitoRecorrentePersistValue {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idTipoDebitoRecorrente: ").append(idTipoDebitoRecorrente).append("\n");
    sb.append("  idUsuario: ").append(idUsuario).append("\n");
    sb.append("  login: ").append(login).append("\n");
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
