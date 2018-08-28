package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.AntecipacaoSimuladaResponse;
import java.math.BigDecimal;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{antecipacao_simulada_lote_response_description}}}
 **/
@ApiModel(description = "{{{antecipacao_simulada_lote_response_description}}}")
public class AntecipacaoSimuladaLoteResponse  {
  
  @SerializedName("valorTotalAntecipado")
  private BigDecimal valorTotalAntecipado = null;
  @SerializedName("valorTotalDesconto")
  private BigDecimal valorTotalDesconto = null;
  @SerializedName("valorTotalComDesconto")
  private BigDecimal valorTotalComDesconto = null;
  @SerializedName("antecipacoesSimuladas")
  private List<AntecipacaoSimuladaResponse> antecipacoesSimuladas = null;

  
  /**
   * {{{antecipacao_simulada_lote_response_valor_total_antecipado_value}}}
   **/
  @ApiModelProperty(value = "{{{antecipacao_simulada_lote_response_valor_total_antecipado_value}}}")
  public BigDecimal getValorTotalAntecipado() {
    return valorTotalAntecipado;
  }
  public void setValorTotalAntecipado(BigDecimal valorTotalAntecipado) {
    this.valorTotalAntecipado = valorTotalAntecipado;
  }

  
  /**
   * {{{antecipacao_simulada_lote_response_valor_total_desconto_value}}}
   **/
  @ApiModelProperty(value = "{{{antecipacao_simulada_lote_response_valor_total_desconto_value}}}")
  public BigDecimal getValorTotalDesconto() {
    return valorTotalDesconto;
  }
  public void setValorTotalDesconto(BigDecimal valorTotalDesconto) {
    this.valorTotalDesconto = valorTotalDesconto;
  }

  
  /**
   * {{{antecipacao_simulada_lote_response_valor_total_com_desconto_value}}}
   **/
  @ApiModelProperty(value = "{{{antecipacao_simulada_lote_response_valor_total_com_desconto_value}}}")
  public BigDecimal getValorTotalComDesconto() {
    return valorTotalComDesconto;
  }
  public void setValorTotalComDesconto(BigDecimal valorTotalComDesconto) {
    this.valorTotalComDesconto = valorTotalComDesconto;
  }

  
  /**
   * {{{antecipacao_simulada_lote_response_antecipacoes_simuladas_value}}}
   **/
  @ApiModelProperty(value = "{{{antecipacao_simulada_lote_response_antecipacoes_simuladas_value}}}")
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
    sb.append("  antecipacoesSimuladas: ").append(antecipacoesSimuladas).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
