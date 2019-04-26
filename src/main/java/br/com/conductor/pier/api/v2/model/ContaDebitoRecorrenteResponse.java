package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o de resposta do recurso de Conta Debito Recorrente
 **/
@ApiModel(description = "Representa\u00E7\u00E3o de resposta do recurso de Conta Debito Recorrente")
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
   * Identifica se o d\u00E9bito recorrente est\u00E1 ativo
   **/
  @ApiModelProperty(value = "Identifica se o d\u00E9bito recorrente est\u00E1 ativo")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * Data fim do d\u00E9bito recorrente
   **/
  @ApiModelProperty(value = "Data fim do d\u00E9bito recorrente")
  public String getDataHoraFim() {
    return dataHoraFim;
  }
  public void setDataHoraFim(String dataHoraFim) {
    this.dataHoraFim = dataHoraFim;
  }

  
  /**
   * Data inicio do d\u00E9bito recorrente
   **/
  @ApiModelProperty(value = "Data inicio do d\u00E9bito recorrente")
  public String getDataHoraInicio() {
    return dataHoraInicio;
  }
  public void setDataHoraInicio(String dataHoraInicio) {
    this.dataHoraInicio = dataHoraInicio;
  }

  
  /**
   * Data do \u00FAltimo pagamento efetuado
   **/
  @ApiModelProperty(value = "Data do \u00FAltimo pagamento efetuado")
  public String getDataHoraUltimoPagamento() {
    return dataHoraUltimoPagamento;
  }
  public void setDataHoraUltimoPagamento(String dataHoraUltimoPagamento) {
    this.dataHoraUltimoPagamento = dataHoraUltimoPagamento;
  }

  
  /**
   * Descri\u00E7\u00E3o do tipo de d\u00E9bito recorrente
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do tipo de d\u00E9bito recorrente")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da Conta (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da Conta (id)")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da ContaDebitoRecorrente (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da ContaDebitoRecorrente (id)")
  public Long getIdContaDebitoRecorrente() {
    return idContaDebitoRecorrente;
  }
  public void setIdContaDebitoRecorrente(Long idContaDebitoRecorrente) {
    this.idContaDebitoRecorrente = idContaDebitoRecorrente;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do tipo de d\u00E9bito recorrente (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do tipo de d\u00E9bito recorrente (id)")
  public Long getIdTipoDebitoRecorrente() {
    return idTipoDebitoRecorrente;
  }
  public void setIdTipoDebitoRecorrente(Long idTipoDebitoRecorrente) {
    this.idTipoDebitoRecorrente = idTipoDebitoRecorrente;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do usu\u00E1rio logado no sistema (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do usu\u00E1rio logado no sistema (id)")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  
  /**
   * Login do usu\u00E1rio logado do sistema
   **/
  @ApiModelProperty(value = "Login do usu\u00E1rio logado do sistema")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * Numero de parcelas do d\u00E9bito recorrente
   **/
  @ApiModelProperty(value = "Numero de parcelas do d\u00E9bito recorrente")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Origem de onde foi feita a modifica\u00E7\u00E3o do registro
   **/
  @ApiModelProperty(value = "Origem de onde foi feita a modifica\u00E7\u00E3o do registro")
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
