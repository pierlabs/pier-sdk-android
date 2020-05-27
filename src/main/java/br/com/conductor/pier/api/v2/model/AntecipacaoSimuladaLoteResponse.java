package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.AntecipacaoSimuladaResponse;
import java.math.BigDecimal;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da resposta do recurso Antecipacao Simulada
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da resposta do recurso Antecipacao Simulada")
public class AntecipacaoSimuladaLoteResponse  {
  
  @SerializedName("valorTotalAntecipado")
  private BigDecimal valorTotalAntecipado = null;
  @SerializedName("valorTotalDesconto")
  private BigDecimal valorTotalDesconto = null;
  @SerializedName("valorTotalComDesconto")
  private BigDecimal valorTotalComDesconto = null;
  @SerializedName("valorTotalAbatimentoJuros")
  private BigDecimal valorTotalAbatimentoJuros = null;
  @SerializedName("antecipacoesSimuladas")
  private List<AntecipacaoSimuladaResponse> antecipacoesSimuladas = null;

  
  /**
   * Valor total antecipado
   **/
  @ApiModelProperty(value = "Valor total antecipado")
  public BigDecimal getValorTotalAntecipado() {
    return valorTotalAntecipado;
  }
  public void setValorTotalAntecipado(BigDecimal valorTotalAntecipado) {
    this.valorTotalAntecipado = valorTotalAntecipado;
  }

  
  /**
   * Valor total do desconto
   **/
  @ApiModelProperty(value = "Valor total do desconto")
  public BigDecimal getValorTotalDesconto() {
    return valorTotalDesconto;
  }
  public void setValorTotalDesconto(BigDecimal valorTotalDesconto) {
    this.valorTotalDesconto = valorTotalDesconto;
  }

  
  /**
   * Valor total antecipado com o desconto
   **/
  @ApiModelProperty(value = "Valor total antecipado com o desconto")
  public BigDecimal getValorTotalComDesconto() {
    return valorTotalComDesconto;
  }
  public void setValorTotalComDesconto(BigDecimal valorTotalComDesconto) {
    this.valorTotalComDesconto = valorTotalComDesconto;
  }

  
  /**
   * Valor total do abatimento de juros
   **/
  @ApiModelProperty(value = "Valor total do abatimento de juros")
  public BigDecimal getValorTotalAbatimentoJuros() {
    return valorTotalAbatimentoJuros;
  }
  public void setValorTotalAbatimentoJuros(BigDecimal valorTotalAbatimentoJuros) {
    this.valorTotalAbatimentoJuros = valorTotalAbatimentoJuros;
  }

  
  /**
   * Antecipa\u00E7\u00F5es Simuladas
   **/
  @ApiModelProperty(value = "Antecipa\u00E7\u00F5es Simuladas")
  public List<AntecipacaoSimuladaResponse> getAntecipacoesSimuladas() {
    return antecipacoesSimuladas;
  }
  public void setAntecipacoesSimuladas(List<AntecipacaoSimuladaResponse> antecipacoesSimuladas) {
    this.antecipacoesSimuladas = antecipacoesSimuladas;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntecipacaoSimuladaLoteResponse {\n");
    
    sb.append("  valorTotalAntecipado: ").append(valorTotalAntecipado).append("\n");
    sb.append("  valorTotalDesconto: ").append(valorTotalDesconto).append("\n");
    sb.append("  valorTotalComDesconto: ").append(valorTotalComDesconto).append("\n");
    sb.append("  valorTotalAbatimentoJuros: ").append(valorTotalAbatimentoJuros).append("\n");
    sb.append("  antecipacoesSimuladas: ").append(antecipacoesSimuladas).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
