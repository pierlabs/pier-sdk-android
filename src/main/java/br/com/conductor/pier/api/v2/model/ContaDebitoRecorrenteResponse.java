package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Response Representation of the Recurrent Debit Account resource
 **/
@ApiModel(description = "Response Representation of the Recurrent Debit Account resource")
public class ContaDebitoRecorrenteResponse  {
  
  @SerializedName("ativo")
  private Boolean ativo = null;
  @SerializedName("dataHoraFim")
  private String dataHoraFim = null;
  @SerializedName("dataHoraInicio")
  private String dataHoraInicio = null;
  @SerializedName("dataHoraUltimoPagamento")
  private String dataHoraUltimoPagamento = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idContaDebitoRecorrente")
  private Long idContaDebitoRecorrente = null;
  @SerializedName("idTipoDebitoRecorrente")
  private Long idTipoDebitoRecorrente = null;
  @SerializedName("idUsuario")
  private Long idUsuario = null;
  @SerializedName("login")
  private String login = null;
  @SerializedName("numeroParcelas")
  private Integer numeroParcelas = null;
  @SerializedName("origem")
  private String origem = null;

  
  /**
   * Identify if the debit recurrent is active
   **/
  @ApiModelProperty(value = "Identify if the debit recurrent is active")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * Ending date the recurrent debit
   **/
  @ApiModelProperty(value = "Ending date the recurrent debit")
  public String getDataHoraFim() {
    return dataHoraFim;
  }
  public void setDataHoraFim(String dataHoraFim) {
    this.dataHoraFim = dataHoraFim;
  }

  
  /**
   * Beginning date of the recurrent debit
   **/
  @ApiModelProperty(value = "Beginning date of the recurrent debit")
  public String getDataHoraInicio() {
    return dataHoraInicio;
  }
  public void setDataHoraInicio(String dataHoraInicio) {
    this.dataHoraInicio = dataHoraInicio;
  }

  
  /**
   * Date of the last payment effected
   **/
  @ApiModelProperty(value = "Date of the last payment effected")
  public String getDataHoraUltimoPagamento() {
    return dataHoraUltimoPagamento;
  }
  public void setDataHoraUltimoPagamento(String dataHoraUltimoPagamento) {
    this.dataHoraUltimoPagamento = dataHoraUltimoPagamento;
  }

  
  /**
   * Description of the type of recurrent debit
   **/
  @ApiModelProperty(value = "Description of the type of recurrent debit")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Identification Code of the Account (id)
   **/
  @ApiModelProperty(value = "Identification Code of the Account (id)")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identification Code of the DebitAccountRecurrent (id)
   **/
  @ApiModelProperty(value = "Identification Code of the DebitAccountRecurrent (id)")
  public Long getIdContaDebitoRecorrente() {
    return idContaDebitoRecorrente;
  }
  public void setIdContaDebitoRecorrente(Long idContaDebitoRecorrente) {
    this.idContaDebitoRecorrente = idContaDebitoRecorrente;
  }

  
  /**
   * Identification Code of the type of recurrent debit (id)
   **/
  @ApiModelProperty(value = "Identification Code of the type of recurrent debit (id)")
  public Long getIdTipoDebitoRecorrente() {
    return idTipoDebitoRecorrente;
  }
  public void setIdTipoDebitoRecorrente(Long idTipoDebitoRecorrente) {
    this.idTipoDebitoRecorrente = idTipoDebitoRecorrente;
  }

  
  /**
   * Logged user id
   **/
  @ApiModelProperty(value = "Logged user id")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  
  /**
   * User loging logged in the system
   **/
  @ApiModelProperty(value = "User loging logged in the system")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * Portion quantity for recurrent debit
   **/
  @ApiModelProperty(value = "Portion quantity for recurrent debit")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Origin where was made the register modification
   **/
  @ApiModelProperty(value = "Origin where was made the register modification")
  public String getOrigem() {
    return origem;
  }
  public void setOrigem(String origem) {
    this.origem = origem;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaDebitoRecorrenteResponse {\n");
    
    sb.append("  ativo: ").append(ativo).append("\n");
    sb.append("  dataHoraFim: ").append(dataHoraFim).append("\n");
    sb.append("  dataHoraInicio: ").append(dataHoraInicio).append("\n");
    sb.append("  dataHoraUltimoPagamento: ").append(dataHoraUltimoPagamento).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idContaDebitoRecorrente: ").append(idContaDebitoRecorrente).append("\n");
    sb.append("  idTipoDebitoRecorrente: ").append(idTipoDebitoRecorrente).append("\n");
    sb.append("  idUsuario: ").append(idUsuario).append("\n");
    sb.append("  login: ").append(login).append("\n");
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("  origem: ").append(origem).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
